package DeepDreamStyle.deepDream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostCommentRestController {

	@RequestMapping(
			value = "/",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE
	)

	public void postPicture() {
		Comment comment = new Comment("Ich", "Das ist halt ja cool!");
	}
}
