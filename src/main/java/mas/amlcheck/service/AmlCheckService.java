package mas.amlcheck.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mas.amlcheck.constant.Constant;
import mas.amlcheck.utils.DateUtils;

public class AmlCheckService {

	private static final Logger log = LoggerFactory.getLogger(AmlCheckService.class);

	
	public static String getRestTemplateStatus() {
		String result = "";
		String templateFileName = "/template.json";
		String resourceDirectory = "/template";
		String clientPathName = "C:\\files\\template-aml";
		File clientFile = new File(clientPathName+templateFileName);
		File clientPath = new File(clientPathName);
		if (clientFile.exists() && !clientFile.isDirectory()) {
			result = Constant.STTS_FILE_EXIST;
			log.info(result);
			return result;
		} else {
			clientPath.mkdir();
			try (InputStream is = AmlCheckService.class.getResourceAsStream(resourceDirectory+templateFileName)) {
				result = templateFileName.replace(".json", " "+DateUtils.getDateFileVersion()+".json");
			    Files.copy(is, Paths.get(clientPathName+result));
			} catch (IOException e) {
				result = Constant.STTS_FILE_ERROR;
				log.warn(e.getMessage());
				log.warn(result);
				return result;
			}
			//result = Constant.STTS_FILE_CREATION;
			log.info(result);
			return result;
		}
		// Use file module
	}
	
	public static String getLastLog () {
		String result = "";
		String logFileName = "/mas-aml-check.log";
		String clientPathName = "C:\\files\\log";
		File clientFile = new File(clientPathName+logFileName);
		File clientPath = new File(clientPathName);
		if (clientFile.exists() && !clientFile.isDirectory()) {
			result = Constant.STTS_FILE_EXIST;
			log.info(result);
		} else {
			boolean success = clientPath.mkdir();
			try {
				success = clientFile.createNewFile();

				result = String.valueOf(success);
				log.info(result);
			} catch (IOException e) {
				e.printStackTrace();
				result = Constant.STTS_FILE_ERROR;
			}
		}
		
		try {
			result = tail2(clientFile, 22);
		} catch (Exception e) {
			result = Constant.STTS_FILE_ERROR;
			e.printStackTrace();
		}
		return result;
	}
	
	private static String tail2( File file, int lines) {
	    java.io.RandomAccessFile fileHandler = null;
	    try {
	        fileHandler = 
	            new java.io.RandomAccessFile( file, "r" );
	        long fileLength = fileHandler.length() - 1;
	        StringBuilder sb = new StringBuilder();
	        int line = 0;

	        for(long filePointer = fileLength; filePointer != -1; filePointer--){
	            fileHandler.seek( filePointer );
	            int readByte = fileHandler.readByte();

	             if( readByte == 0xA ) {
	                if (filePointer < fileLength) {
	                    line = line + 1;
	                }
	            } else if( readByte == 0xD ) {
	                if (filePointer < fileLength-1) {
	                    line = line + 1;
	                }
	            }
	            if (line >= lines) {
	                break;
	            }
	            sb.append( ( char ) readByte );
	        }

	        String lastLine = sb.reverse().toString();
	        return lastLine;
	    } catch( java.io.FileNotFoundException e ) {
	        e.printStackTrace();
	        return null;
	    } catch( java.io.IOException e ) {
	        e.printStackTrace();
	        return null;
	    }
	    finally {
	        if (fileHandler != null )
	            try {
	                fileHandler.close();
	            } catch (IOException e) {
	            }
	    }
	}
}
