UPDATE core_admin_right SET icon_url='ti ti-tags' WHERE  id_right='BLOG_TAGS_MANAGEMENT';
UPDATE core_admin_right SET icon_url='ti ti-notebook' WHERE  id_right='BLOG_MANAGEMENT';
UPDATE core_portlet_type SET icon_name='list-details' WHERE  id_portlet_type='BLOG_LIST_PORTLET';
UPDATE core_portlet_type SET icon_name='text-caption' WHERE  id_portlet_type='BLOG_PORTLET';
DELETE FROM blog_page_template WHERE id_page_template_document IN ( 0, 1 );
INSERT INTO blog_page_template VALUES ( 1,'skin/plugins/blog/portlet/default_portlet_blog.html','no picture','Post template', 'BLOG_PORTLET'), (0,'skin/plugins/blog/portlet/default_portlet_list_blog.html','no picture','Posts list template', 'BLOG_LIST_PORTLET');