package fr.paris.lutece.plugins.blog.service;

import fr.paris.lutece.portal.business.user.parameter.DefaultUserParameterHome;
import fr.paris.lutece.portal.service.util.AppLogService;

/**
 * Blog parameter service.
 */
public class BlogParameterService
{
    private static BlogParameterService _singleton = new BlogParameterService( );

    public static final String DSKEY_DEFAULT_NUMBER_MANDATORY_TAGS = "blog.advanced_parameters.number_mandatory_tags";
    public static final String MARK_DEFAULT_NUMBER_MANDATORY_TAGS = "number_mandatory_tags";

    /**
     * Get the unique instance of the service
     *
     * @return The unique instance
     */
    public static BlogParameterService getInstance( )
    {
        return _singleton;
    }

    public void updateNumberMadantoryTags(String nbMandatoryTags) {
        int valueNbMandatoryTags = 0;
        try {
            valueNbMandatoryTags = Integer.parseInt(nbMandatoryTags);
        } catch (NumberFormatException e) {
            AppLogService.error("Incorrect value for number mandatory tags", e);
        }

        if(valueNbMandatoryTags<0)
        {
            valueNbMandatoryTags=0;
        }

        DefaultUserParameterHome.update( DSKEY_DEFAULT_NUMBER_MANDATORY_TAGS, Integer.toString(valueNbMandatoryTags));
    }

    public int getNumberMadantoryTags( ) {
        try {
            return Integer.parseInt(DefaultUserParameterHome.findByKey(DSKEY_DEFAULT_NUMBER_MANDATORY_TAGS));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
