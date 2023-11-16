package QuestionTwo;

import QuestionOne.genericLL;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GenericLLTester
{
    private genericLL<String> genericLLFactory()
    {
        return new genericLL<String>();
    }

    private genericLL<String> createNonEmptyGenericLL()
    {
        genericLL<String> genLL = genericLLFactory();
        genLL.insert("Cat");
        genLL.insert("Fish");
        genLL.insert("Cactus");
        return genLL;
    }

    @Test(timeout=200)
    public void testGetCurrent_Non_Empty_List_True()
    {

    }

    @Test(timeout=200)
    public void testSetCurrent_Non_Empty_List()
    {

    }

    @Test(timeout=200)
    public void testInsert_Non_Empty_List()
    {

    }

    @Test(timeout=200)
    public void testInsert_Empty_List()
    {

    }

    @Test(timeout=200)
    public void testDelete_At_Least_3_Nodes_In_List_Delete_Last_Item_In_List()
    {

    }

    @Test(timeout=200)
    public void testIsContained_Non_Empty_List_True()
    {

    }
}
