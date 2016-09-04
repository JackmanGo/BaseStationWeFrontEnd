package testSendHttp;

import org.junit.Test;

import com.jinantech.util.HttpRequest;

public class TestQueryLocalInJunit {
	@Test
	public void queryLocal(){
		
	    HttpRequest httpRequest = new HttpRequest();
		String str = httpRequest.sendGet("http://www.cellid.cn/cidInfo.php","lac=33033f&cell_id=45411");
		System.out.println(str);
	
	}
	@Test
	public void queryTXT(){
		String str1 = "cidMap(30.547938,104.066144,'(33033,45411)	30.547938,104.066144<br>四川省成都市武侯区天府大道中段688号萃华路')";
		String str = str1.split("\\(33033,45411\\)")[1];
		System.out.println(str.split("<br>")[0]+str.split("<br>")[1].split("'")[0]);
	}
}
