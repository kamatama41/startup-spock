package example.tasklist

import spock.lang.Specification

class TaskSpecification extends Specification {
    def "タイトルを登録できる"(){
        when:"最初の操作"
        def task = new Task()
        task.setTitle("タイトルです")

        then:"最初の検証"
        task.getTitle() == "タイトルです"
    }

    def "期限を登録できる"(){
        when:"最初の操作"
        def task = new Task()
        task.setDueTo(new Date(2017, 2, 25))

        then:"最初の検証"
        task.getDueTo() == new Date(2017, 2, 25)
    }
}
