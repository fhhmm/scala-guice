if [ $# -eq 0 ]; then
  exit 1
fi

ROOT_DIR=$(cd $(dirname $0);cd ..;pwd)
MAIN_DIR="$ROOT_DIR/src/main"

function compile (){
  file=$1

  if [[ "$file" =~ .*\.scala ]]; then
    scalac "$file"
    if [ $? -eq 0 ]; then
      echo "$1 compiled!"
    fi
  elif [ -d "$file" ]; then
    path=${file%/}
    for child_file in `ls $path`
    do
      compile "$path/$child_file"
    done
  fi
}

for arg in $@
do
  compile $arg
done
