package br.pucrs.algo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static List<Range> readTestFile( String filename ) {
		List<Range> list = new ArrayList<Range>();
		try {
			String path = 
					System.getProperty( "user.dir" ) 
					+ File.separator + "in" 
							+ File.separator + filename;
			
			System.out.println( path );
			
			FileReader fileReader = new FileReader( new File( path ) ); // reads the file
			BufferedReader br = new BufferedReader( fileReader ); // creates a buffering character input stream
			String line;
			
			while ( ( line = br.readLine() ) != null ) {
				String[] tokens = line.split( "-" );
				list.add( 
						new Range( Long.parseLong( tokens[ 0 ] ), Long.parseLong( tokens[ 1 ] ) ) );
			}
			
			fileReader.close(); // closes the stream and release the resources

		} catch ( IOException e ) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static void writeSolutionFile( String filename, List<Range> output ) {
		try {
			String path = 
					System.getProperty( "user.dir" ) 
					+ File.separator + "out" 
							+ File.separator + filename;
			
			System.out.println( path );
			
			BufferedWriter bufferedWriter = 
					new BufferedWriter( new FileWriter( path, false ) );
 
            for ( Range range : output ) {
            	bufferedWriter.write( range.getStart() + "-" + range.getEnd() );
                bufferedWriter.newLine();
			}
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 	}
}
