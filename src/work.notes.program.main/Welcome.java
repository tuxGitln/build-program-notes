@WebServlet("/welcome")
public class Welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = SanitizeHtml.convert(req.getParameter("name"));
        String password = SanitizeHtml.convert(req.getParameter("password"));

    }

}