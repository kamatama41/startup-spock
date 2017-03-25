package example.tasklist

import spock.lang.Specification

class TaskSpecification extends Specification {
    def "タイトルを登録できる"(){
        when:"最初の操作"
        def task = new Task()
        task.setTitle("タイトルです")

        then:"最初の検証"
        task.getTitle == "タイトルです"
    }
}
