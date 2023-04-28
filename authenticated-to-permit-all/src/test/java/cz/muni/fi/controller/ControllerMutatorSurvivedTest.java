package cz.muni.fi.controller;

import cz.muni.fi.security.WithMockCustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithSecurityContextTestExecutionListener;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testng.annotations.Test;

import static org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrint.SYSTEM_ERR;

@SpringBootTest
@AutoConfigureMockMvc(print = SYSTEM_ERR)
@TestExecutionListeners(WithSecurityContextTestExecutionListener.class)
public class ControllerMutatorSurvivedTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MockMvc mvc;

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 4/4 (100%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    @WithMockCustomUser
    public void test_mutantSurvived() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/response"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("response"));
    }
}
