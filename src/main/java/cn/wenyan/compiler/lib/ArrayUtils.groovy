package cn.wenyan.compiler.lib

class ArrayUtils {
    static def getIndex(index){
        if(index instanceof Integer)return (Integer)index - 1
        return index
    }

    static def getArray(array){
        return array.getClass() == HashMap.Node.class?array.getValue():array
    }
}
