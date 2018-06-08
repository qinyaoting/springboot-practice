package sample.test;

import com.xyz.bean.VehicleDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import sample.test.SampleTestApplication;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/25/18
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleTestApplication.class)
@JsonTest
public class VehicleDetailsJsonTest {

    @Autowired
    private JacksonTester<VehicleDetails> json;

    @Test
    public void serializeJson() throws Exception {
        VehicleDetails vehicleDetails = new VehicleDetails("Honda", "Civic");
        assertThat(this.json.write(vehicleDetails)).isEqualTo("vehicledetails.json");
    }

    @Test
    public void deseJson() throws Exception {
        String content = "{\"make\":\"Ford\",\"model\":\"Focus\"}";
        assertThat(this.json.parse(content))
                .isEqualTo(new VehicleDetails("Ford", "Focus"));
        assertThat(this.json.parseObject(content).getMake()).isEqualTo("Ford");

    }
}
