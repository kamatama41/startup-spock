package example.tasklist

import spock.lang.Specification


class TaskListSpecification extends Specification {

    def "タスクを登録できる"(){
        when:"最初の操作"
        def taskList = new TaskList()
        taskList.addTask("タイトル1",new Date(2017, 2, 25))

        then:"最初の検証"
        taskList.getAllTasks()[0].getTitle() == "タイトル1"
        taskList.getAllTasks()[0].getDueTo() == new Date(2017, 2, 25)
    }

    def "タスクを2つ登録できる"(){
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

    def "タスクを3つ登録できる"(){
        when:"最初の操作"
        def taskList = new TaskList()
        taskList.addTask("タイトル1",new Date(2017, 2, 25))
        taskList.addTask("タイトル2",new Date(2017, 2, 26))
        taskList.addTask("タイトル3",new Date(2017, 2, 27))

        then:"最初の検証"
        taskList.getAllTasks()[0].getTitle() == "タイトル1"
        taskList.getAllTasks()[0].getDueTo() == new Date(2017, 2, 25)
        taskList.getAllTasks()[1].getTitle() == "タイトル2"
        taskList.getAllTasks()[1].getDueTo() == new Date(2017, 2, 26)
        taskList.getAllTasks()[2].getTitle() == "タイトル3"
        taskList.getAllTasks()[2].getDueTo() == new Date(2017, 2, 27)
    }
}
