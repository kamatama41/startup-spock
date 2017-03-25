package example.tasklist

import spock.lang.Specification


class TaskListSpecification extends Specification {

    def "タスクを登録できる"(){
        when:"最初の操作"
        def taskList = new TaskList()
        taskList.addTask("タイトルです",new Date(2017, 2, 25))

        then:"最初の検証"
        taskList.getTask().getTitle() == "タイトルです"
        taskList.getTask().getDueTo() == new Date(2017, 2, 25)
    }

    def "タスクを複数登録できる"(){
        when:"最初の操作"
        def taskList = new TaskList()
        taskList.addTask("タイトル1",new Date(2017, 2, 25))
        taskList.addTask("タイトル2",new Date(2017, 2, 26))

        then:"最初の検証"
        taskList.getAllTasks()[0].getTitle() == "タイトル1"
        taskList.getAllTasks()[0].getDueTo() == new Date(2017, 2, 25)
        taskList.getAllTasks()[1].getTitle() == "タイトル2"
        taskList.getAllTasks()[1].getDueTo() == new Date(2017, 2, 26)
    }
}
