package tw.semanteco.rdfparser;

import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;

import com.hp.hpl.jena.rdf.model.Model;

public class rdf2json_file {
	
	public static void main(String[] args)
    {
        Model model = RDFDataMgr.loadModel("Product.rdf") ;
        
        System.out.println() ;
        System.out.println("#### ---- Write as Turtle") ;
        System.out.println() ;
        RDFDataMgr.write(System.out, model, Lang.RDFJSON) ;
        
        System.out.println() ;
        System.out.println("#### ---- Write as Turtle (streaming)") ;
        System.out.println() ;
        RDFDataMgr.write(System.out, model, RDFFormat.RDFJSON) ;
        
        System.out.println() ;
        System.out.println("#### ---- Write as Turtle via model.write") ;
        System.out.println() ;
        model.write(System.out, "RDF/JSON") ;
    }

}
