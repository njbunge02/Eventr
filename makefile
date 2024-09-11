default: src/eventr/EventrEventsForm.java src/eventr/Events.java
	javac -cp dist/lib/AbsoluteLayout.jar src/eventr/EventrEventsForm.java src/eventr/Events.java

run: src/eventr/EventrEventsForm.class src/eventr/Events.class
	java -cp dist/lib/AbsoluteLayout.jar:src eventr.EventrEventsForm

clean:
	rm -f src/eventr/*.class
