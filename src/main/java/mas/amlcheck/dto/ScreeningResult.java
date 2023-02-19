package mas.amlcheck.dto;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Data
public class ScreeningResult {

	private String id;
	private String customerNo;
	private Input input;
	private Hits hits;
}
