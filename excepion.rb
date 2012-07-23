

require 'java'

$CLASSPATH << "target/classes"


class CallbackTarget
  def doTheCallBack
    some_other_method
  end

  def some_other_method
    yet_another_method
  end

  def yet_another_method
    raise "here be exceptions"
  end
end

java_import 'com.example.Test'

callback = CallbackTarget.new
Test.someJavaMethod(callback)