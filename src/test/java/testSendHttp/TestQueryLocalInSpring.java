package testSendHttp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jinantech.Application;
import com.jinantech.util.HttpRequest;

@SpringApplicationConfiguration(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestQueryLocalInSpring{
	@Autowired
	HttpRequest httpRequest;
   
	@Test
	public void queryLocal(){
		String str = httpRequest.sendGet("http://www.cellid.cn/cidInfo.php","lac=22554&cell_id=10");
	}

}
