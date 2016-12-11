package lorapp.supervision.handler;

import org.springframework.beans.factory.annotation.Autowired;

import lorapp.db.entity.UploadMessage;
import lorapp.supervision.service.JacksonService;
import lorapp.supervision.service.SimpleSupervisionService;

public class MessageHandler {
	@Autowired
	JacksonService jacksonService;
	@Autowired
	SimpleSupervisionService simpleSuperService;
	
	public void handleMessage(String message){
		UploadMessage upMsg = jacksonService.toObject(message, UploadMessage.class);
		upMsg.getDevAppMap().getAppEUI();
		upMsg.getDevAppMap().getDevEUI();
	}
}
