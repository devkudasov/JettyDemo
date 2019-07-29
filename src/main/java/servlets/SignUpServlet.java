package servlets;

import users.AccountService;
import users.UserProfile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {
    private AccountService accountService;

    public SignUpServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) {
        final String login = request.getParameter("login");
        final String password = request.getParameter("password");

        accountService.addUser(new UserProfile(login, password, ""));
    }
}
