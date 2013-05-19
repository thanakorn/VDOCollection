package vdocollection



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Video)
class VideoTests {

    @Test
	void testCreateVideo(){
		def vdo = new Video(title:'New video',url:'http://www.youtube.com/watch?v=0DYptJTSF-k',category:'technology')
		assert vdo.title == "New video"
		assert vdo.url == "http://www.youtube.com/watch?v=0DYptJTSF-k"
		assert vdo.category == "technology"
	}
}
