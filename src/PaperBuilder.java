import java.io.File;


public class PaperBuilder {
	private Paper tmp;
	private File file;
	final static String PAPERS_DIRECTORY="papers/";
	
	public static void main(String[] args) {
		
	
	}

	public Paper buildPaper(File file) {
		return tmp;
	}

	private static boolean verifyFile(File file) {
		System.out.println("Verfying File : "+file.getAbsolutePath()+"  "+file.exists());

		String extension = "";
		 
        try {
            if (file != null /*&& file.exists()*/) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
                System.out.println("HERE");
            }
        } catch (Exception e) {
            extension = "";
        }
        
        System.out.println("Extension is : "+extension);
        if(extension.equals(".pdf")) {
        	return true;
		
        }
		return false;
	}

	private void RenameFile() {

	}

	private void saveFile() {
	}

}
