package DeepDreamStyle.deepDream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostPictureRestController {
	
	@RequestMapping(
		value = "/newData",
		method = RequestMethod.POST,
		produces = MediaType.APPLICATION_JSON_VALUE
	)

	public void postPicture() {
		MetaData data = new MetaData("Test1", true);
	}
}
