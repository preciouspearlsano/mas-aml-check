package mas.amlcheck.dto;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Data
public class Outbox {
	private String id;
	private String eventType;
	private String commandId;
	private String commandPath;
	private String data;
	private String replyId;
	private String replyPath;
	private String requestId;
	private String creationDate;
}
