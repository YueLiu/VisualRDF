package tw.semanteco.rdfparser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jena.riot.RDFDataMgr;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * Servlet implementation class rdf2jsonservlet
 */
@WebServlet("/rdf2jsonservlet")
public class rdf2jsonservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rdf2jsonservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//http://escience.rpi.edu/ontology/semanteco/2/0/pollution.owl
		String urlname = request.getParameter("urlname");
		Model mdl = RDFDataMgr.loadModel(urlname);
        mdl.write(response.getOutputStream(), "RDF/JSON");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
