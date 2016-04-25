
import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
    String layout = "templates/layout.vtl";

    get("/", (req,res) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      Integer side1input = Integer.parseInt(request.queryParams("side1input"));
      Integer side2input = Integer.parseInt(request.queryParams("side2input"));
      Integer side3input = Integer.parseInt(request.queryParams("side3input"));

      Triangle testTriangle = new Triangle(side1input, side2input, side3input);
      String result = testTriangle.testSide();

      model.put("side1input", side1input);
      model.put("side2input", side2input);
      model.put("side3input", side3input);
      if (result == "Isosceles") {
        model.put("result", "ahhhhh blaahh isosceles");
      } else {
        model.put("result", result);
      }
      model.put("template","templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

}
