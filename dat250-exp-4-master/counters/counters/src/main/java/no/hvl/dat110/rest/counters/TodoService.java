package no.hvl.dat110.rest.counters;

import java.util.ArrayList;

public class TodoService {

    private ArrayList<Todo> list = new ArrayList<>();

    public TodoService() {
    }

    public void addTodo (Todo todo) {
        list.add(todo);
    }

    public ArrayList<Todo> getTodos() {
        return list;
    }

    public Todo getTodo (String id) {
        for (Todo t : list) {
            if (t.getId().equals(id))
                return t;
        }
        return null;
    }

    public void deleteTodo (String id) {
        list.removeIf(t -> t.getId().equals(id));
    }

    public boolean todoExist (String id) {
        for (Todo t : list) {
            if (t.getId().equals(id))
                return true;
        }
        return false;
    }

}