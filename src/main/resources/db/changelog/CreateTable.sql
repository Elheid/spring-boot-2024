CREATE TABLE IF NOT exists java_todo.ToDoList (
    ID INTEGER GENERATED ALWAYS AS identity,
    NAME VARCHAR(25) NOT NULL,
    EVENTS VARCHAR(255)[] NOT null,
    CONSTRAINT PK_LIST Primary key(ID)
    );
