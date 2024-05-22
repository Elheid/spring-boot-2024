    CREATE TABLE IF NOT exists java_todo.ToDoList (
        ID INTEGER GENERATED ALWAYS AS identity,
        NAME VARCHAR(25) NOT NULL,
        EVENTS VARCHAR(255)[] NOT null,
        CONSTRAINT PK_LIST Primary key(ID)
    );

    CREATE TABLE IF NOT EXISTS java_todo.event
    (
        ID   BIGINT GENERATED ALWAYS AS IDENTITY,
        NAME VARCHAR(128) NOT NULL,
        PRIMARY KEY (id)
        );

    CREATE TABLE IF NOT EXISTS java_todo.event_list
    (
        todo_list_id BIGSERIAL REFERENCES java_todo.ToDoList (ID) ON DELETE CASCADE,
        event_id   BIGSERIAL REFERENCES java_todo.event (ID),
        PRIMARY KEY (todo_list_id, event_id)
    )
