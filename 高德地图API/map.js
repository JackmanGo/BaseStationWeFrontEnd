var phones = [];
var phonesLocal = new Map();
var map = new AMap.Map('container');
    map.setZoom(10);
    map.setCenter([104.065,30.65]);

/*
var marker = new AMap.Marker({
        position: [104.066144,30.547938],
        map:map
    });
*/
 var infowindow = new AMap.InfoWindow({
     content: '<h3>正常基站</h1><div>四川省成都市武侯区天府大道中段688号萃华路</div>',
     offset: new AMap.Pixel(0, -30),
     size:new AMap.Size(230,0)
});
 /*
 var clickHandle = AMap.event.addListener(marker, 'click', function() {
    infowindow.open(map, marker.getPosition())
})
*/


var mapObj = new AMap.Map('iCenter');
mapObj.plugin('AMap.Geolocation', function () {
    geolocation = new AMap.Geolocation({
        enableHighAccuracy: true,//是否使用高精度定位，默认:true
        timeout: 10000,          //超过10秒后停止定位，默认：无穷大
        maximumAge: 0,           //定位结果缓存0毫秒，默认：0
        convert: true,           //自动偏移坐标，偏移后的坐标为高德坐标，默认：true
        showButton: true,        //显示定位按钮，默认：true
        buttonPosition: 'LB',    //定位按钮停靠位置，默认：'LB'，左下角
        buttonOffset: new AMap.Pixel(10, 20),//定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
        showMarker: true,        //定位成功后在定位到的位置显示点标记，默认：true
        showCircle: true,        //定位成功后用圆圈表示定位精度范围，默认：true
        panToLocation: true,     //定位成功后将定位到的位置作为地图中心点，默认：true
        zoomToAccuracy:true      //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
    });
    mapObj.addControl(geolocation);
    AMap.event.addListener(geolocation, 'complete', onComplete);//返回定位信息
    AMap.event.addListener(geolocation, 'error', onError);      //返回定位出错信息
});


function showUserLocation(message){
    var receive = eval('(' +message.data+ ')');;
    console.log(receive);
    console.log(receive.numbers!=null);
   //判断是终端位置还是基站位置
    if(receive.numbers!=null&&receive.numbers!=1){
    var deviceID = receive.numbers;
    var longitude=receive.longitude;
    var latitude = receive.latitude;
    //判断是否是显示在地图上的终端
    var isAdd = phones.indexOf(deviceID);
    if(isAdd==-1){
    //如果不是则添加到数组中
     phones.push(deviceID);
     console.log(longitude,latitude);
      var marker = new AMap.Marker({
       icon: "mobile_phone.png",
       position:[longitude,latitude],
       map:map
    });
    //保存位置信息到Map中
      phonesLocal.set(deviceID,marker);
    }else{
    //以后被保存起来的终端，获取其位置，移除后显示新的位置
      var localMaker = phonesLocal.get(deviceID);
      map.remove(localMaker);
        console.log(longitude,latitude);
       var marker = new AMap.Marker({
       icon: "mobile_phone.png",
       position:[longitude,latitude],
       map:map
    });
      phonesLocal.set(deviceID,marker);
    }
}else{
    //基站位置
    var longitude=receive.longitude;
    var latitude = receive.latitude;
    var marker = new AMap.Marker({
        position: [longitude,latitude],
        map:map
    });
}
}

 var ws = new WebSocket("ws://localhost:8080/getLocation");
    ws.onopen = function(message) {
    };
    ws.onclose = function(message) {

    };
 ws.onmessage = function(message) {
      showUserLocation(message)
 };
 //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function() {
        ws.close();
    };
    //关闭连接
    function closeWebSocket() {
        ws.close();
    }

