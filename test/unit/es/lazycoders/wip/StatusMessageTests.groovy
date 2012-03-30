package es.lazycoders.wip



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(StatusMessage)
@Mock(User)
class StatusMessageTests {

    void testConstraints() {
		def user = new User(
							fullName: "John Smith",
							username: "johnsmth",
							email: "john@smith.es",
							password: "password")

		println user.validate()
		assert user.save(flush: true)
    }
}
