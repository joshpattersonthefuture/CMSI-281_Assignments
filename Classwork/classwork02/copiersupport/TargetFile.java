/*
*File: TargetFile.java
*Purpose: Writes Contents in File ---> MyFileCopier.java
*Author : Josh Patterson
*Date   : 9/6/18

*/
package copiersupport;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TargetFile {

    public TargetFile( String target, String source ) {
        try {
            BufferedWriter buffwrite = new BufferedWriter( new FileWriter( source ) );
            buffwrite.write(target);
            buffwrite.close();
        } catch ( IOException ) {
        }
    }
}
