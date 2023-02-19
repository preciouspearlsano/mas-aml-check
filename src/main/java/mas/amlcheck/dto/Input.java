package mas.amlcheck.dto;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */

@Data
public class Input {
	private String entityType;
	private String status;
	private Double hitsTotal;
	private String result;
}
