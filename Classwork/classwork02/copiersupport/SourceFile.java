/*
*File: SourceFile.java
*Purpose: Writes Contents in File --> MyFileCopier.java
*Author : Josh Patterson
*Date   : 9/6/18

*/
package copiersupport;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SourceFile {
    private String file;

    public SourceFile( String source ) {
        try {
            BufferedReader buffread = new BufferedReader( new FileReader( source ) );
            this.file = buffread.readLine();
        } catch( IOException ) {
        }
    }

    public String getFileContent() {
        return this.file;
    }
}
