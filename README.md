# Design-and-build-of-a-notes-app

This is  GOOD LOOKING AND FAMILIAR UI and code the
logic for Notes activity, including RecyclerView, Adapter, data Model and an Add (+)
button used to add a new note. A note will have a Title, Priority (Boolean) and Date
Created.
This app will have an edit activity to edit a note and save it or cancel (with Save and
Cancel buttons). Saving the edits will be reflected on the data model and the recycler
view after save is clicked.
Then add (+) button will open the same edit activity but with default values (instead of
populating a clicked note), and current time will be shown in the new note details field.
The data model will be populated with some data records when it is created. No
persistence (data saving) is required here. i.e the modified data is gone when the data
model object is destroyed.

Edit Note Activity Clicking a note Or the Add button will show this activity,
populated with the details of the clicked note (or default values when creating a new
note). When Save button is clicked, the note is saved in the data model, this activity is
finished, and the Notes activity recycler view is refreshed to reflect the new data. When
Cancel button is clicked, the edit activity is finished.
