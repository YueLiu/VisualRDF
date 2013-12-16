package tw.semanteco.rdfparser;

import org.apache.jena.riot.RDFDataMgr;

import com.hp.hpl.jena.rdf.model.Model;

public class rdf2json_file {
	
	public static void main( String[] args )
    {
        Model mdl = RDFDataMgr.loadModel("http://escience.rpi.edu/ontology/semanteco/2/0/pollution.owl");
        mdl.write(System.out, "RDF/JSON");
    }

}