package es.lazycoders.wip

class StatusMessage {

	String body
	Date date
	StatusMessage inResponseTo = null
	static belongsTo = [user: User]

    static constraints = {
		body blank: false, maxSize: 140 // Twitter style! :P
		date blank: false, date: true
		inResponseTo nullable: true
		user nullable: false
    }
}
