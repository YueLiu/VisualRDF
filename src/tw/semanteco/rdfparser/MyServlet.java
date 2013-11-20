package tw.semanteco.rdfparser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
        Model model = RDFDataMgr.loadModel("Product.rdf") ;
        
        public void function1(){
        
        System.out.println() ;
        System.out.println("#### ---- Write as Turtle") ;
        System.out.println() ;
        RDFDataMgr.write(System.out, model, Lang.RDFJSON) ;
        
        }
        
        public void function2(){
        System.out.println() ;
        System.out.println("#### ---- Write as Turtle (streaming)") ;
        System.out.println() ;
        RDFDataMgr.write(System.out, model, RDFFormat.RDFJSON) ;
        
        }
        
        public void function3(){
        System.out.println() ;
        System.out.println("#### ---- Write as Turtle via model.write") ;
        System.out.println() ;
        model.write(System.out, "RDF/JSON") ;
        }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyServlet myServlet = new MyServlet();

	        if (request.getParameter("button1") != null) {
	        	myServlet.function1();
	        } else if (request.getParameter("button2") != null) {
	        	myServlet.function2();
	        } else if (request.getParameter("button3") != null) {
	        	myServlet.function3();
	        } else {
	            // ???
	        }

	        request.getRequestDispatcher("/WebContent/index.jsp").forward(request, response);
	}

}
