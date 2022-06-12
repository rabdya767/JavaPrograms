import java.io.File;

public class FL {
    public static void main(String[] args) throws Exception{
        File f=new File("C:\\Users\\SANTHOSH RABDYA\\Desktop\\pgrms\\java\\.vscode");

        System.out.println(f.isHidden());
        System.out.println(f.isDirectory());

        File  list[]=f.listFiles();
        
       // String str[]=f.list("C:\\Users\\SANTHOSH RABDYA\\Desktop\\pgrms\\java","true");

        for(File x:list)
        {
            System.out.println(x.getName()+" "+x.getPath());
        }


    }
}
