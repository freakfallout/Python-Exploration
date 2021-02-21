if __name__ == '__main__':

    destinations = []
    while True:
        print('Enter a National Park or \'done\' to output parks: ', end='')
        inputString = str(input())
        if inputString.lower() == 'done':
            break
        destinations.append(inputString)

    for i in range(len(destinations)):
        if i < len(destinations) - 1:
            print(destinations.__getitem__(i).title(), end=' | ')
        else:
            print(destinations.__getitem__(i).title())
