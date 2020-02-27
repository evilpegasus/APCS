package Chapter7.Labs;

import java.io.*;

public abstract class TestQuestion {

    protected String question;

    
    protected abstract void readQuestion() throws FileNotFoundException ;
}