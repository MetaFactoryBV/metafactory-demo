package org.metafactory.tutorial.example4.model.implementation;

/**
 * Phone - Created by MetaFactory: Automation of Software Development
 * 
 * @author - Merijn
 */
public class Phone
{
  /** primary key */
  private Long    phoneId;

  private String  number;

  private String  description;

  private Person  person;

  private Company company;

  /**
   * Getter for property phoneId.
   * 
   * @return value of property phoneId
   */
  public Long getPhoneId()
  {
    return this.phoneId;
  }

  /**
   * Setter for property phoneId.
   * 
   * @param phoneId new value of property phoneId
   */
  public void setPhoneId(final Long phoneId)
  {
    this.phoneId = phoneId;
  }

  /**
   * Getter for property number.
   * 
   * @return value of property number
   */
  public String getNumber()
  {
    return this.number;
  }

  /**
   * Setter for property number.
   * 
   * @param number new value of property number
   */
  public void setNumber(final String number)
  {
    if (number == null || number.trim().length() == 0)
    {
      this.number = null;
    }
    else
    {
      this.number = number;
    }
  }

  /**
   * Getter for property description.
   * 
   * @return value of property description
   */
  public String getDescription()
  {
    return this.description;
  }

  /**
   * Setter for property description.
   * 
   * @param description new value of property description
   */
  public void setDescription(final String description)
  {
    if (description == null || description.trim().length() == 0)
    {
      this.description = null;
    }
    else
    {
      this.description = description;
    }
  }

  /**
   * Getter for property person.
   * 
   * @return value of property person
   */
  public Person getPerson()
  {
    return this.person;
  }

  /**
   * Setter for property person.
   * 
   * @param person new value of property person
   */
  public void setPerson(final Person person)
  {
    this.person = person;
  }

  /**
   * Getter for property company.
   * 
   * @return value of property company
   */
  public Company getCompany()
  {
    return this.company;
  }

  /**
   * Setter for property company.
   * 
   * @param company new value of property company
   */
  public void setCompany(final Company company)
  {
    this.company = company;
  }

  /**
   * equals - Fields used as businesskey: 1) number.
   * 
   * @param phone
   * @return boolean
   */
  public boolean equals(final Phone phone)
  {
    boolean result = true;
    // If all business keys are null, return false
    if (this.getNumber() == null)
    {
      result = false;
    }
    else
    {
      if (this.getNumber() != null && !this.getNumber().equals(phone.getNumber()))
      {
        result = false;
      }
    }
    return result;
  }

  /**
   * hashCode - Fields used as businesskey: 1) number.
   * 
   * @return integer
   */
  public int hashCode()
  {
    int result;
    result = 14;

    if (number != null)
    {
      result = 29 * result + this.getNumber().hashCode();
    }

    return result;
  }

  /**
   * toString -
   * 
   * @return String
   */
  public String toString()
  {
    StringBuilder result = new StringBuilder("Phone: ");

    result.append("number=" + number);
    result.append(", ");

    result.append("description=" + description);

    return result.toString();
  }

}