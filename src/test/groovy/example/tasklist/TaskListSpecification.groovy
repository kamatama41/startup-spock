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

}
