package by.epam.task.notification;

import by.epam.task.entity.Oval;

public interface Observable {
    public void notifyAboutChanges(Oval oval);
}
