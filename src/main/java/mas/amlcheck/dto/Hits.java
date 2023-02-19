package mas.amlcheck.dto;

import java.util.Date;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Data
public class Hits {
	private Double score;
	private String riskLevel;
	private Date created;
}
