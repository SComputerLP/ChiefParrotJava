package chiefparrot.tracking.model;

import chiefparrot.data.Message;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 * ChiefParrotJava
 *
 * @author Julian Maierl
 * @version 1.0.0
 */
public class MessageModel extends AbstractListModel<Message>
        implements Iterable<Message>
{

  private List<Message> messages;

  /**
   * Constructor
   */
  public MessageModel()
  {
    messages = new LinkedList<>();
  }

  /**
   *
   * @return the size of the message list
   */
  @Override
  public int getSize()
  {
    return messages.size();
  }

  /**
   *
   * @param index index of the element to return
   * @return message of the given index
   */
  @Override
  public Message getElementAt(int index)
  {
    return messages.get(index);
  }

  /**
   *
   * @param m Message to add
   */
  public void add(Message m)
  {
    messages.add(m);
    super.fireIntervalAdded(this, getSize() - 1, getSize() - 1);
  }

  /**
   *
   * @return the last message of the list
   */
  public Message getLastMessage()
  {
    return messages.get(getSize() - 1);
  }

  /**
   *
   * @return the iterator of the list
   */
  @Override
  public Iterator<Message> iterator()
  {
    return messages.iterator();
  }

  /**
   *
   * @return the list
   */
  public List<Message> getMessages()
  {
    return messages;
  }

}
