/*
*File: TargetFile.java
*Purpose: A File Reader Writer using Packages
*Author : Josh Patterson
*Date   : 9/6/18

*/
import coppiersupport.*;
import copiersupport.SourceFile;
import copiersupport.TargetFile;
import java.util.Scanner;
import java.io.IOException;

public class MyFileCopier {
  public static void main(String[] args) throws IOException {
    System.out.println("Enter file name:");
    Scanner reader = new Scanner(System.in);
    String src   = reader.nextLine();
    SourceFile source = new SourceFile(src);
    String tgt = source.getContents();
    TargetFile target = new TargetFile(tgt, src + ".copy ");
    source.closeFile();
    target.closeFile();
  }
}
