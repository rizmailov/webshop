package ru.countrystuff.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;
import ru.countrystuff.service.CatalogueService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by RAMSES on 29.03.2016.
 */
@Component
public class CatalogueServletRequestHandler implements HttpRequestHandler {

    @Autowired
    CatalogueService catalogueService;

    @Override
    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setAttribute("itemList", catalogueService.getAllItems());
            req.getRequestDispatcher("catalogue.jsp").forward(req, resp);
    }
}
