package DeepDreamStyle.deepDream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PatchPrivateFlagRestController {
		
	@RequestMapping(
		value = "/newData",
		method = RequestMethod.PATCH,
		produces = MediaType.APPLICATION_JSON_VALUE
	)

	public void patchPrivateFlag() {
		//get ID und dann update Flag;
		
	}
}

