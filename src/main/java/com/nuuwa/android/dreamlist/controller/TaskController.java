package com.nuuwa.android.dreamlist.controller;

import com.nuuwa.android.dreamlist.entity.Task;
import com.nuuwa.android.dreamlist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(name = "/task", method = RequestMethod.GET)
    public Task getTask(@RequestParam(value = "title") String title) {
        return taskService.findTask(title);
    }

/*    @RequestMapping(name = "/task", method = RequestMethod.PUT)
    public Task save(@RequestParam(value = "id") Long id,
                     @RequestParam(value = "title") String title,
                     @RequestParam(value = "date") Date date,
                     @RequestParam(value = "suspect") String suspect) {
        Task task = new Task(id, title, date, suspect);
        return taskService.save(task);
    }*/

    @RequestMapping(name = "/task", method = RequestMethod.PUT)
    public Task save(@RequestParam(value = "id") Long id,
                     @RequestParam(value = "title") String title) {
        Task task = new Task(id, title);
        return taskService.save(task);
    }

}
