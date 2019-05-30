import mod.SomeEnums;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "scoutingServlet",
        urlPatterns = "/Quality of Team"
)
public class ScoutingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String teamQual = req.getParameter("Type");

        ScoutingLogic logic  = new ScoutingLogic();
        SomeEnums l = SomeEnums.valueOf(teamQual);

        List action = logic.getWhatShouldBeDone(l);

        req.setAttribute("brands", action);
        RequestDispatcher view = req.getRequestDispatcher("Webapp.result.jsp");
        view.forward(req, resp);

    }
}
