package uteevbkru.controller;

import uteevbkru.domain.DataObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Controller
// мапим наш REST на /myservice
@RequestMapping(value = "/myservice")
public class MainController {

    // этот метод будет принимать время методом GET и на его основе
    // отвечать клиенту
    @RequestMapping(value= "/{time}", method = RequestMethod.GET)
    @ResponseBody
    public DataObject getMyData(@PathVariable long time) {
        return new DataObject(Calendar.getInstance(), "Это ответ метода GET!");
    }

    // этот метод будет принимать Объект MyDataObject и отдавать его клиенту
    // обычно метод PUT используют для сохранения либо для обновления объекта
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public DataObject putMyData(@RequestBody DataObject md) {
        return md;
    }

    // этот метод будет методом POST отдавать объект MyDataObject
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public DataObject postMyData() {
        return new DataObject(Calendar.getInstance(), "это ответ метода POST!");
    }

    // этот метод будет принимать время методом DELETE
    // и на его основе можно удалит объект
    @RequestMapping(value= "/{time}", method = RequestMethod.DELETE)
    @ResponseBody
    public DataObject deleteMyData(@PathVariable long time) {
        return new DataObject(Calendar.getInstance(), "Это ответ метода DELETE!");
    }
}