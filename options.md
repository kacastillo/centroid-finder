## javaCV
- t is fast and popular and get maintained often. 
- it turn frames into exactly what my code needed
- NOTE: it is very big in size and harder to fix if it crash. Can leak memory if you dont close with "grabber"

##JCodec
- very small and simple to install and work. Error are very easy to understand 
- Note: Will pick this consider the fact that it mainly support H.264 video in MP4 (which we will use MP4)
- NOTE: it is a bit slower than javaCV and metadata take more work, so you do the math yourself.
- Could have bug because it is not very active anymore so no maintained.

## vicj
- actively maintain and can open any videos, fast
- NOTE: VLC have to i on every computer that run the programs, converting frames to bufferedImage take xtra work.

--

- I think we should use javaCV and depend on what video we look at we could use JCodec

this is the Maven for the javaCV: 
  <dependency>
    <groupId>org.bytedeco</groupId>
    <artifactId>javacv-platform</artifactId>
    <version>1.5.14</version>
  </dependency>
^^ went with JAvaCV

this is the Maven for JCodec:
<dependency>
    <groupId>org.jcodec</groupId>
    <artifactId>jcodec</artifactId>
    <version>0.2.5</version>
</dependency>
